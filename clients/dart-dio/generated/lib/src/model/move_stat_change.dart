//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/move_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_stat_change.g.dart';

/// MoveStatChange
///
/// Properties:
/// * [change] - The maximum amount of change to the referenced stat.
/// * [move] - The move causing the change.
@BuiltValue()
abstract class MoveStatChange implements Built<MoveStatChange, MoveStatChangeBuilder> {
  /// The maximum amount of change to the referenced stat.
  @BuiltValueField(wireName: r'change')
  int get change;

  /// The move causing the change.
  @BuiltValueField(wireName: r'move')
  MoveSummary get move;

  MoveStatChange._();

  factory MoveStatChange([void updates(MoveStatChangeBuilder b)]) = _$MoveStatChange;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveStatChangeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveStatChange> get serializer => _$MoveStatChangeSerializer();
}

class _$MoveStatChangeSerializer implements PrimitiveSerializer<MoveStatChange> {
  @override
  final Iterable<Type> types = const [MoveStatChange, _$MoveStatChange];

  @override
  final String wireName = r'MoveStatChange';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveStatChange object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'change';
    yield serializers.serialize(
      object.change,
      specifiedType: const FullType(int),
    );
    yield r'move';
    yield serializers.serialize(
      object.move,
      specifiedType: const FullType(MoveSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MoveStatChange object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveStatChangeBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'change':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.change = valueDes;
          break;
        case r'move':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MoveSummary),
          ) as MoveSummary;
          result.move.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MoveStatChange deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveStatChangeBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}


