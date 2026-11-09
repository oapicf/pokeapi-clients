//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/move_stat_change.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'stat_affecting_moves.g.dart';

/// StatAffectingMoves
///
/// Properties:
/// * [increase] - A list of moves and how they change the referenced stat.
/// * [decrease] - A list of moves and how they change the referenced stat.
@BuiltValue()
abstract class StatAffectingMoves implements Built<StatAffectingMoves, StatAffectingMovesBuilder> {
  /// A list of moves and how they change the referenced stat.
  @BuiltValueField(wireName: r'increase')
  BuiltList<MoveStatChange> get increase;

  /// A list of moves and how they change the referenced stat.
  @BuiltValueField(wireName: r'decrease')
  BuiltList<MoveStatChange> get decrease;

  StatAffectingMoves._();

  factory StatAffectingMoves([void updates(StatAffectingMovesBuilder b)]) = _$StatAffectingMoves;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(StatAffectingMovesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<StatAffectingMoves> get serializer => _$StatAffectingMovesSerializer();
}

class _$StatAffectingMovesSerializer implements PrimitiveSerializer<StatAffectingMoves> {
  @override
  final Iterable<Type> types = const [StatAffectingMoves, _$StatAffectingMoves];

  @override
  final String wireName = r'StatAffectingMoves';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    StatAffectingMoves object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'increase';
    yield serializers.serialize(
      object.increase,
      specifiedType: const FullType(BuiltList, [FullType(MoveStatChange)]),
    );
    yield r'decrease';
    yield serializers.serialize(
      object.decrease,
      specifiedType: const FullType(BuiltList, [FullType(MoveStatChange)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    StatAffectingMoves object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required StatAffectingMovesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'increase':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MoveStatChange)]),
          ) as BuiltList<MoveStatChange>;
          result.increase.replace(valueDes);
          break;
        case r'decrease':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MoveStatChange)]),
          ) as BuiltList<MoveStatChange>;
          result.decrease.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  StatAffectingMoves deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = StatAffectingMovesBuilder();
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


