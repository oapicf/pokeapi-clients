//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/move_detail_contest_combos_normal.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_detail_contest_combos.g.dart';

/// MoveDetailContestCombos
///
/// Properties:
/// * [normal] 
/// * [super_] 
@BuiltValue()
abstract class MoveDetailContestCombos implements Built<MoveDetailContestCombos, MoveDetailContestCombosBuilder> {
  @BuiltValueField(wireName: r'normal')
  MoveDetailContestCombosNormal get normal;

  @BuiltValueField(wireName: r'super')
  MoveDetailContestCombosNormal get super_;

  MoveDetailContestCombos._();

  factory MoveDetailContestCombos([void updates(MoveDetailContestCombosBuilder b)]) = _$MoveDetailContestCombos;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveDetailContestCombosBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveDetailContestCombos> get serializer => _$MoveDetailContestCombosSerializer();
}

class _$MoveDetailContestCombosSerializer implements PrimitiveSerializer<MoveDetailContestCombos> {
  @override
  final Iterable<Type> types = const [MoveDetailContestCombos, _$MoveDetailContestCombos];

  @override
  final String wireName = r'MoveDetailContestCombos';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveDetailContestCombos object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'normal';
    yield serializers.serialize(
      object.normal,
      specifiedType: const FullType(MoveDetailContestCombosNormal),
    );
    yield r'super';
    yield serializers.serialize(
      object.super_,
      specifiedType: const FullType(MoveDetailContestCombosNormal),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MoveDetailContestCombos object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveDetailContestCombosBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'normal':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MoveDetailContestCombosNormal),
          ) as MoveDetailContestCombosNormal;
          result.normal.replace(valueDes);
          break;
        case r'super':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MoveDetailContestCombosNormal),
          ) as MoveDetailContestCombosNormal;
          result.super_.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MoveDetailContestCombos deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveDetailContestCombosBuilder();
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

