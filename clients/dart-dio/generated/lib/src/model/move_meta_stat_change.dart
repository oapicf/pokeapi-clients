//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/stat_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_meta_stat_change.g.dart';

/// MoveMetaStatChange
///
/// Properties:
/// * [change] - The amount of change.
/// * [stat] - The stat being affected.
@BuiltValue()
abstract class MoveMetaStatChange implements Built<MoveMetaStatChange, MoveMetaStatChangeBuilder> {
  /// The amount of change.
  @BuiltValueField(wireName: r'change')
  int get change;

  /// The stat being affected.
  @BuiltValueField(wireName: r'stat')
  StatSummary get stat;

  MoveMetaStatChange._();

  factory MoveMetaStatChange([void updates(MoveMetaStatChangeBuilder b)]) = _$MoveMetaStatChange;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveMetaStatChangeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveMetaStatChange> get serializer => _$MoveMetaStatChangeSerializer();
}

class _$MoveMetaStatChangeSerializer implements PrimitiveSerializer<MoveMetaStatChange> {
  @override
  final Iterable<Type> types = const [MoveMetaStatChange, _$MoveMetaStatChange];

  @override
  final String wireName = r'MoveMetaStatChange';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveMetaStatChange object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'change';
    yield serializers.serialize(
      object.change,
      specifiedType: const FullType(int),
    );
    yield r'stat';
    yield serializers.serialize(
      object.stat,
      specifiedType: const FullType(StatSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MoveMetaStatChange object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveMetaStatChangeBuilder result,
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
        case r'stat':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(StatSummary),
          ) as StatSummary;
          result.stat.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MoveMetaStatChange deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveMetaStatChangeBuilder();
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


