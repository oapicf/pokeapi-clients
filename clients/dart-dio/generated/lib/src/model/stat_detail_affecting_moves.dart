//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/stat_detail_affecting_moves_increase_inner.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'stat_detail_affecting_moves.g.dart';

/// StatDetailAffectingMoves
///
/// Properties:
/// * [increase] 
/// * [decrease] 
@BuiltValue()
abstract class StatDetailAffectingMoves implements Built<StatDetailAffectingMoves, StatDetailAffectingMovesBuilder> {
  @BuiltValueField(wireName: r'increase')
  BuiltList<StatDetailAffectingMovesIncreaseInner> get increase;

  @BuiltValueField(wireName: r'decrease')
  BuiltList<StatDetailAffectingMovesIncreaseInner> get decrease;

  StatDetailAffectingMoves._();

  factory StatDetailAffectingMoves([void updates(StatDetailAffectingMovesBuilder b)]) = _$StatDetailAffectingMoves;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(StatDetailAffectingMovesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<StatDetailAffectingMoves> get serializer => _$StatDetailAffectingMovesSerializer();
}

class _$StatDetailAffectingMovesSerializer implements PrimitiveSerializer<StatDetailAffectingMoves> {
  @override
  final Iterable<Type> types = const [StatDetailAffectingMoves, _$StatDetailAffectingMoves];

  @override
  final String wireName = r'StatDetailAffectingMoves';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    StatDetailAffectingMoves object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'increase';
    yield serializers.serialize(
      object.increase,
      specifiedType: const FullType(BuiltList, [FullType(StatDetailAffectingMovesIncreaseInner)]),
    );
    yield r'decrease';
    yield serializers.serialize(
      object.decrease,
      specifiedType: const FullType(BuiltList, [FullType(StatDetailAffectingMovesIncreaseInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    StatDetailAffectingMoves object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required StatDetailAffectingMovesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'increase':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(StatDetailAffectingMovesIncreaseInner)]),
          ) as BuiltList<StatDetailAffectingMovesIncreaseInner>;
          result.increase.replace(valueDes);
          break;
        case r'decrease':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(StatDetailAffectingMovesIncreaseInner)]),
          ) as BuiltList<StatDetailAffectingMovesIncreaseInner>;
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
  StatDetailAffectingMoves deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = StatDetailAffectingMovesBuilder();
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

